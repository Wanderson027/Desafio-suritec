import React, {Component} from 'react';
import Header from './components/header';

import { FormCliente, ListaCLiente} from './components/cliente'


class App extends Component{
  
  render(){

    return(
      <div className="contrainer">
          <Header />

          <div className="row">
            <div className="col-md-6">
              <FormCliente />

            </div>
            <div className="col-md-6">
              <ListaCLiente />

            </div>
          </div>
      </div>
    )
  }
}


export default App;
