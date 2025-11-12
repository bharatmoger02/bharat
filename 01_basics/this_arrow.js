/*const user = {
    username : "bharat",
    password : "03bha",

    welcomeMsg : function(){
        console.log(`${this.username}, welcome to website`);
        console.log(this);
        
    }
}
user.welcomeMsg()
user.username = "lohit"
user.welcomeMsg()
console.log(this);*/

/*******************arrows************************/
//const addTwo = (n1,n2) => (n1+n2)

//const addTwo = (n1,n2) => {return n1+n2}
//console.log(addTwo(5,6));
const addTwo = (n1,n2) => ({username: "bharat"})
console.log(addTwo(5,6));