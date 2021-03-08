let reviews : number[] = [5,5,15,5.4,6];
let total : number = 0 ;
for (let i = 0; i < reviews.length ; i++){
    console.log(reviews[i]);
    total+=reviews[i];
}

let average : number = total / reviews.length;
console.log("review average is : " + average)