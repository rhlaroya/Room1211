import React from 'react';
//props are data that is passed into the compnent whe  it si made
//every instance of the compnent can have different or the same props;
//the function much like html properties, but the are completely custom for react c

interface IPropProps{
    name:string
    color:string
}

export class PropComponent extends React.Component<IPropProps,any>{

    render(){
        return(
            <div>
                <p>My name is {this.props.name}</p>
                <p>My favorite color is {this.props.color}</p>
            </div>
        )
    }
}

