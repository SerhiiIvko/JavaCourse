package independentWork.advertMobile.zeroAndCruix.other;

import java.util.Scanner;

public class TicTacToe {
    static char[][] matrix = new char[3][3]; /* Игровое поле */
    static Scanner s;

    /* Наша главная функция :) */
    public static void main(String[] argv)
    {
        s = new Scanner(System.in);
        char done;

        done = ' ';
        init_matrix();
        do{
            disp_matrix();
            get_player_move();
            done = check();
            if(done != ' ') break;
            get_computer_move();
            if(done != ' ') break;
        }while(done == ' ');

        if(done == 'X') System.out.println("Поздравляем! Вы победили!");
        else System.out.println("К сожалению, Вы проиграли!");

        return;
    }

    /* Инициализация игрового поля */
    public static void init_matrix()
    {
        int i, j;
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                matrix[i][j] = ' ';
            }
        }
    }

    /* Вывести игровое поле на экран */
    public static void disp_matrix()
    {
        int i;
        for(i = 0; i < 3; i++){
            StringBuilder sb = new StringBuilder();
            sb.append(' ');
            sb.append(matrix[i][0]);
            sb.append(" |");
            sb.append(' ');
            sb.append(matrix[i][1]);
            sb.append(" |");
            sb.append(' ');
            sb.append( matrix[i][2]);
            System.out.println(sb.toString());
            if(i != 2) System.out.println(" - | - | - ");
        }
        System.out.println();
    }

    /* Ход игрока */
    public static void get_player_move()
    {
        int i, j;

        System.out.println("Введите координаты x, y: ");
        //scanf("%d%*c%d", &j, &i);
        i = s.nextInt();
        j = s.nextInt();

        i--; j--;

        if(matrix[i][j] != ' '){
            System.out.println("Неверный ход. Попробуйте еще раз!\n");
            get_player_move();
        }
        else matrix[i][j] = 'X';
    }

    /* Ход компьютера */
    public static void get_computer_move()
    {
        int i  =0 , j = 0;

        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                if(matrix[i][j] == ' ') break;
            }
            if(matrix[i][j] == ' ') break;
        }

        if(i*j == 9){
            System.out.println("Ничья!");
            System.exit(0);
        }
        else matrix[i][j] = 'O';
    }

    /* Проверить, есть ли победители? */
    public static char check()
    {
        int i;

        for(i = 0; i < 3; i++)
            if(matrix[i][0] == matrix[i][1] &&
                    matrix[i][0] == matrix[i][2]) return matrix[i][0];
        for(i = 0; i < 3; i++)
            if(matrix[0][i] == matrix[1][i] &&
                    matrix[0][i] == matrix[2][i]) return matrix[0][i];

        if(matrix[0][0] == matrix[1][1] &&
                matrix[1][1] == matrix[2][2])
            return matrix[0][0];

        if(matrix[0][2] == matrix[1][1] &&
                matrix[1][1] == matrix[2][0])
            return matrix[0][2];

        return ' ';
    }
}