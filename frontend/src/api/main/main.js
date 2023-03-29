import axios from 'axios';

let base = '/api/main'

export const GetTest = params => {
  return axios.get(base + '/getTest', params);
}
