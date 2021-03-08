 let sportsOne : string[] = ["Golf","Cricket","Tennis","Football"]
// for ( let i =0 ; i < sportsOne.length ; i++){
//     console.log(sportsOne[i]);
// }

// simplified loop

for (let tempSport of sportsOne){
    if(tempSport == "Cricket"){
        console.log(tempSport + "<< My favorite Sport ")
    }else{
        console.log(tempSport)
    }
    
}