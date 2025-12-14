const express = require('express');
const app = express();

app.get('/health', (req, res) => {
  res.send('Backend is running and healthy');
});

app.listen(8080, () => {
  console.log('Backend started on port 8080');
});
