
//we are going to get a random Chuick norris joke and limit it to nerdy
//this function will return the joke
export async function getChuckNorrisJoke():Promise<string>{
    const response = await fetch('http://api.icndb.com/jokes/random?limitTo=[nerdy]');
    const body = await response.json()
    console.log(body);
    return body.value.joke
}