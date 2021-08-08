import Vuex from 'vuex';
import keyboard from '../modules/keyboardStore';
import comapny from '../modules/comapnyStore';
import common from '../modules/commonStore';

export const store = new Vuex.Store({
    modules: {
        keyboard,
        comapny,
        common
    }
});
