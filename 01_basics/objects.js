const mySym = Symbol()
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
console.log(JsUser.greetings());

