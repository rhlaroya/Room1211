import React from 'react';

interface IClickerState {
    numClick:number
}

export class ClickerComponent extends React.Component<any,IClickerState>{
    constructor(props:any){
        super(props)
        this.state = {
            numClick:0
        }
    }

    increment = () => {
        //takes in an object that replaces the previous state
        this.setState({
            ...this.state, 
            numClick: this.state.numClick + 1
        })
        //this increment
    }

    render(){
        return(
            <div>
                <p>Number of clicks: {this.state.numClick}</p>
                <button onClick={this.increment}>+1</button>    
            </div>
        )
    }
}