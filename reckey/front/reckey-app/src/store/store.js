import Vuex from 'vuex';
import keyboard from '../modules/keyboardStore';
import comapny from '../modules/comapnyStore';

export const store = new Vuex.Store({
    modules: {
        keyboard,
        comapny
    }
});
