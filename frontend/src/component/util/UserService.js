import axios from 'axios';

export default function getUsers() {
        axios.get('localhost:8083/allusers')
            .then(res => res.data);
    }



