const express = require('express');

const app = express();

//setings
app.set('port', 3000)

app.listen(app.set('port'), () => {
    console.log('server on port', app.get('port'));
})