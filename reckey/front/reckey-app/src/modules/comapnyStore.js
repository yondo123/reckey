const state = {
    companies: []
};
const getters = {
    getCompanyList(state) {
        state.companies = [
            {
                imageUrl: '../assets/img/leopold.png',
                name: 'LEOPOLD',
                id: '00001'
            },
            {
                imageUrl: '../assets/img/leopold.png',
                name: 'ABKO',
                id: '00002'
            },
            {
                imageUrl: '../assets/img/leopold.png',
                name: 'CORASIR',
                id: '00003'
            },
            {
                imageUrl: '../assets/img/leopold.png',
                name: 'LOGITECH',
                id: '00004'
            }
        ];

        return state.companies;
    }
};
const mutations = {};
const actions = {};

export default {
    namespaced: true,
    state,
    getters,
    mutations,
    actions
};
