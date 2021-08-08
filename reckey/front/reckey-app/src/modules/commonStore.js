const state = {
    menuActive: false
};
const getters = {
    isMenuActive(state) {
        return state.menuActive;
    }
};
const mutations = {
    toggleMenuActive(state) {
        return (state.menuActive = !state.menuActive);
    }
};
const actions = {};

export default {
    namespaced: true,
    state,
    getters,
    mutations,
    actions
};
