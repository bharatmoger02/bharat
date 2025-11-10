/*const mySym = Symbol()
const JsUser = {
    name : "Bharat",
    mySym : "myKey1",
    age : 21,
    usn : "is019",
    email : "03bha@gmail.com",
    isLoggedIn : false,
}
//console.log(JsUser);
//console.log(typeof [mySym]);
JsUser.greetings = function(){
    console.log(`hello, ${this.name}`);    
}
console.log(JsUser.greetings()); */
const myCoures = {
    name : "js",
    price : 999,
    instructor : "bharat",
}
//const {instructor} = myCoures
//console.log(instructor);
const {instructor : ins} = myCoures
console.log(ins);

