const express = require('express');
const router = express.Router();

// Define route for the root path
router.get('/', (req, res) => {
  res.send('Welcome to the Express app!');
});

// Example API route
router.get('/api/data', (req, res) => {
  res.json({ message: 'This is some sample data.' });
});

module.exports = router;
