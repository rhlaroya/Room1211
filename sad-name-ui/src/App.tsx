import React from 'react';
import logo from './logo.svg';
import './App.css';
import {FirstComponent} from './components/first-component/FirstComponent';
import { SecondComponent } from './components/second-component/SecondComponent';
import { ClickerComponent } from './components/clicker-component/ClickerComponent';
import { PropComponent } from './components/prop-component/PropComponent';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';
import { LifecycleComponent } from './components/lifecycle-component/LifecycleComponent';
import { ChuckNorris } from './components/chuck-norris/ChuckNorris';
//this is the root of all the components we will make
// two rules to veing a component
//2 return some jsx/tsx that has one rooot tag
const App: React.FC = () => {
  return (
    // <div className="App">
    //   <header className="App-header">
    //     {/* <img src={logo} className="App-logo" alt="logo" />
    //     <p>
    //       Edit <code>src/App.tsx</code> and save to reload.
    //     </p> */}
    //     <a
    //       className="App-link"
    //       href="https://reactjs.org"
    //       target="_blank"
    //       rel="noopener noreferrer"
    //     >
    //       Learn React
    //     </a>
    //   </header>
<div className="App">

        <Router>
          <Route path='/first' component={FirstComponent}/>
          {/* /** history, match, location */ }
          <Route path='/second' component={SecondComponent}/>
          <Route path='/clicker' component={ClickerComponent}/>
          <Route path='/props' render={()=> <PropComponent name={'Regae'} color={'red'}/>}/>
          <Route path='/lifecyle' component={LifecycleComponent}/>
          <Route path='/chuck' component={ChuckNorris}/>
        </Router>


      {/* <FirstComponent/>
      <SecondComponent/>
      <ClickerComponent/>
      <PropComponent name={'Regae'} color={'red'}/> */}
  </div>
 
  );
}

export default App;
