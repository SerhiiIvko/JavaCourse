//Additional task
var manager = {
    name: "Will",
    surname: "Smith",
    age: 55

};
console.log(manager.name);

var secretary = new Object();
secretary.name = "John";
secretary.surname = "Connor";
secretary.age = 20;

//Main task
var document = {
    header: "Document",
    body: "body",
    footer: "footer",
    date: "10.10.2018",
    document_func: function () {
        console.log(document.header
            + ",\n"
            + document.body + ",\n"
            + document.footer + ",\n"
            + document.date)
    },
    application: {
        header: {
            inner_header: "Document1",
            header_func: function () {
                console.log(document.application.header.inner_header)
            }
        },
        body: {
            inner_body: "body1",
            body_func: function () {
                console.log(document.application.body.inner_body)
            }
        },
        footer: {
            inner_footer: "footer1",
            footer_func: function () {
                console.log(document.application.footer.inner_footer)
            }
        },
        date: {
            inner_date: "10.10.2020",
            date_func: function () {
                console.log(document.application.date.inner_date)
            }
        }
    }
};
document.document_func();
document.application.header.header_func();
document.application.body.body_func();
document.application.footer.footer_func();
document.application.date.date_func();