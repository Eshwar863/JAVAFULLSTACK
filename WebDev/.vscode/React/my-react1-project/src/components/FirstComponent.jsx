// rcc command was used to create this component
// The component is named `firstcomponent` and it extends React's `Component` class.
// It renders a simple `div` with the text "firstcomponent".

import React, { Component } from 'react'
import SecondComponent from './SecondComponent'

export class FirstComponent extends Component {
  render() {
    return (
      <div>
        <h1>Good Evening</h1>
        <SecondComponent name = "John" />
        
      </div>

    )
  }
}

export default FirstComponent

// This is a simple React component named `FirstComponent` that extends `Component` from React.
// It contains a `render` method that returns a `div` with the text "firstcomponent".
// The component is exported as the default export of the module, allowing it to be imported and used in other files.