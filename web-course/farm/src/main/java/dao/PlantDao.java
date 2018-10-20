package dao;

import entity.Plant;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PlantDao extends AbstractDao<Plant> {
    public PlantDao(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void add(Plant plant) {
        if (plant == null) {
            throw new IllegalArgumentException("Plant can not be null");
        }
        try {
            Connection connection = getConnection();
            String insertTableSQL = "INSERT INTO plants"
                    + "(name, seedPrice, harvestPrice, isGrowing, isRipen, ripenTime, startGrowingTime, endGrowingTime) "
                    + "VALUES(?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertTableSQL);
            String name = plant.getName();
            double seedPrice = plant.getSeedPrice();
            double harvestPrice = plant.getHarvestPrice();
            boolean isGrowing = plant.isGrowing();
            boolean isRipen = plant.isRipen();
            long ripenTime = plant.getRipenTime();
            Date startGrowingTime = plant.getStartGrowingTime();
            Date endGrowingTime = plant.getEndGrowingTime();
            preparedStatement.setString(1, name);
            preparedStatement.setDouble(2, seedPrice);
            preparedStatement.setDouble(3, harvestPrice);
            preparedStatement.setBoolean(4, isGrowing);
            preparedStatement.setBoolean(5, isRipen);
            preparedStatement.setLong(6, ripenTime);
            preparedStatement.setTimestamp(7, getTimeStamp(startGrowingTime));
            preparedStatement.setTimestamp(8, getTimeStamp(endGrowingTime));
            preparedStatement.executeUpdate();
            closeConnection();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Plant getById(int id) {
        Plant result = null;
        try {
            Connection connection = getConnection();
            String selectTableSQL = "SELECT * FROM plants WHERE id = (?)";
            PreparedStatement preparedStatement = connection.prepareStatement(selectTableSQL);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                int plantId = resultSet.getInt("id");
                String name = resultSet.getString("name");
                double seedPrice = resultSet.getDouble("seedPrice");
                double harvestPrice = resultSet.getDouble("harvestPrice");
                boolean isGrowing = resultSet.getBoolean("isGrowing");
                boolean isRipen = resultSet.getBoolean("isRipen");
                long ripenTime = resultSet.getLong("ripenTime");
                Date startGrowingTime = new Date(resultSet.getTimestamp("startGrowingTime").getTime());
                Date endGrowingTime = new Date(resultSet.getTimestamp("endGrowingTime").getTime());
                result = new Plant(plantId, name, seedPrice, harvestPrice, isGrowing, isRipen, ripenTime,
                        startGrowingTime, endGrowingTime);
                closeConnection();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

    @Override
    public List<Plant> getAll() {
        List<Plant> resultList = new ArrayList<>();
        try {
            Connection connection = getConnection();
            String selectAllTableSQL = "SELECT * FROM plants";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(selectAllTableSQL);
            while (resultSet.next()) {
                int plantId = resultSet.getInt("id");
                String name = resultSet.getString("name");
                double seedPrice = resultSet.getDouble("seedPrice");
                double harvestPrice = resultSet.getDouble("harvestPrice");
                boolean isGrowing = resultSet.getBoolean("isGrowing");
                boolean isRipen = resultSet.getBoolean("isRipen");
                long ripenTime = resultSet.getLong("ripenTime");
                Date startGrowingTime = new Date(resultSet.getTimestamp("startGrowingTime").getTime());
                Date endGrowingTime = new Date(resultSet.getTimestamp("endGrowingTime").getTime());
                resultList.add(new Plant(plantId, name, seedPrice, harvestPrice, isGrowing, isRipen, ripenTime,
                        startGrowingTime, endGrowingTime));
                closeConnection();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return resultList;
    }

    @Override
    public Plant update(Plant plant) {
        Plant updatedPlant = null;
        try {
            Connection connection = getConnection();
            String updateTableSQL = "UPDATE plants SET name = ?, seedPrice = ?, harvestPrice = ?, isGrowing = ?," +
                    "isRipen = ?, ripenTime = ?, startGrowingTime = ?, endGrowingTime = ? where id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(updateTableSQL);
            preparedStatement.setString(1, plant.getName());
            preparedStatement.setDouble(2, plant.getSeedPrice());
            preparedStatement.setDouble(3, plant.getHarvestPrice());
            preparedStatement.setBoolean(4, plant.isGrowing());
            preparedStatement.setBoolean(5, plant.isRipen());
            preparedStatement.setLong(6, plant.getRipenTime());
            preparedStatement.setTimestamp(7, getTimeStamp(plant.getStartGrowingTime()));
            preparedStatement.setTimestamp(8, getTimeStamp(plant.getEndGrowingTime()));
            preparedStatement.executeUpdate();
            closeConnection();
            updatedPlant = getById(plant.getId());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return updatedPlant;
    }

//    @Override
//    public void remove(Plant group) {
//        removeById(group.getId());
//    }

    @Override
    public void removeById(int id) {
        try {
            Connection connection = getConnection();
            String deleteFromTableSQL = "DELETE FROM plants WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(deleteFromTableSQL);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            closeConnection();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

//    @Override
//    public void removeAll() {
//        try {
//            Connection connection = getConnection();
//            String removeAllTableSQL = "DELETE FROM groups";
//            Statement statement = connection.createStatement();
//            statement.executeUpdate(removeAllTableSQL);
//            closeConnection();
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//    }

    public static void main(String[] args) throws SQLException {
        Plant plant = new Plant(1, "potato", 20, 45, false, false,
                5000, new Date(), new Date());
        PlantDao plantDao = new PlantDao(DataSourceFactory.getMySQLDataSource());
        plantDao.add(plant);
        System.out.println(plantDao.getAll());
    }
}