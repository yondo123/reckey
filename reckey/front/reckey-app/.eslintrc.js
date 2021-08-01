module.exports = {
    root: true,
    env: {
        browser: true,
        commonjs: true,
        es6: true
    },
    extends: ['eslint:recommended', 'plugin:vue/essential', 'prettier', 'plugin:prettier/recommended'],
    globals: {
        Atomics: 'readonly',
        SharedArrayBuffer: 'readonly'
    },
    parserOptions: {
        ecmaVersion: 2018
    },
    plugins: ['vue', 'prettier'],
    rules: {}
};
