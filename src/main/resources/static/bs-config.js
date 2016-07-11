var proxyMiddleware = require('http-proxy-middleware');
var fallbackMiddleware = require('connect-history-api-fallback');

module.exports = {
    server: {
        middleware: {
            1: proxyMiddleware(['/swagger' , '/api'], {
                target: 'http://localhost:8080',//useful in dev-mode when running client side with 'npm start'. proxies api requests to java backend server
                changeOrigin: true
            }),

            2: fallbackMiddleware({
                index: '/index.html', verbose: true
            })
        }
    }
};
