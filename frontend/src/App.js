import React from 'react';
// eslint-disable-next-line no-unused-vars
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css'
import {Col, ButtonToolbar, Button} from "react-bootstrap";
import getUsers from "./component/util/UserService";

class App extends React.Component {
    state = {
        todos: [],
        users: []
    };


    setUsers = () => {
        this.setState({ users: getUsers()});
    }



    render() {
        return (
                //<div className="App">
                    <div class="container-fluid">
                        <div class="row">
                            <Col xs={3}>
                                <ButtonToolbar>
                                    <Button onClick={this.setUsers} variant="primary">1</Button>
                                    <Button variant="secondary">2</Button>
                                    <Button variant="success">3</Button>
                                    <Button variant="warning">4</Button>
                                </ButtonToolbar>
                            </Col>
                            <Col xs={5}>
                                col 2
                            </Col>
                            <Col xs={4}>
                                col 3
                            </Col>
                        </div>
                    </div>
                //</div>
        );
    }
}

export default App;
