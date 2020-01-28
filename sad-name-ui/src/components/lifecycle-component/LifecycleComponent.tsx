import React from 'react';

export class LifecycleComponent extends React.Component<any,any>{
    constructor(props:any){
        super(props)
        this.state = {
            numUpdates:0
    
        }
    }

    componentDidMount(){
        console.log('fuck');
    }

    componentDidUpdate(){
        //you are allowed to put set state in component.get update bjut it has to be conditionbal
        let someVar = false;
        if(someVar){
        this.setState({
            ...this.state,
            numUpdates:this.state.numUpdates+1
        })
    }
    }
    
    update = () =>{
       this.forceUpdate()
    }
    render(){
        return(
            <div>
                <p>I am the lifecycle, I have been updated</p>
                <button>Update</button>
            </div>
        )
    }
}