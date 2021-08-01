import Vuex from 'vuex';
import keyboard from '../modules/keyboardStore';

export const store = new Vuex.Store({
    modules: {
        keyboard
    }
});
