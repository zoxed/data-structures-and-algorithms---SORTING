var reviews = [5, 5, 15, 5.4, 6];
var total = 0;
for (var i = 0; i < reviews.length; i++) {
    console.log(reviews[i]);
    total += reviews[i];
}
var average = total / reviews.length;
console.log("review average is : " + average);
