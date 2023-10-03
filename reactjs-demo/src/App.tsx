import React from 'react';
import './App.css';
import User from "./User";
import {
    BrowserRouter,
    Routes,
    Route,
    Link
} from "react-router-dom";
import Home from "./Home";
import About from "./About";

function App() {
  return (
      <BrowserRouter>
          <nav>
              <Link to="/">Home</Link> |{" "}
              <Link to="about">About</Link>
          </nav>
          <Routes>
              <Route path="/" element={<Home />}/>
              <Route path="/about" element={<About />}/>
          </Routes>
      </BrowserRouter>
  );
}

export default App;