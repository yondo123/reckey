const state = {
    keyboards: []
};
const getters = {
    getKeyboardList(state) {
        state.keyboards = [
            {
                imageUrl: '../assets/img/leopold.png',
                name: 'LEOPOLD',
                type: 'F', //full
                rating: '3.6',
                switch: ['red', 'brown', 'blue', 'green', 'etc']
            },
            {
                imageUrl: '../assets/img/abko.png',
                name: 'ABKO G',
                type: 'T', //10-key
                rating: '3.6',
                switch: ['red', 'brown', 'blue']
            },
            {
                imageUrl: '../assets/img/logitech.png',
                name: 'logitech cherry100',
                type: 'L', //ETC(less)
                rating: '3.6',
                switch: ['red', 'brown']
            }
        ];

        return state.keyboards;
    }
};

const mutations = {
    setKeyboardList(state, list) {
        list = [
            {
                name: '',
                type: 'F', //full
                rating: '3.6',
                switch: ['red', 'brown', 'blue', 'green', 'etc']
            },
            {
                name: '',
                type: 'T', //10-key
                rating: '3.6',
                switch: ['red', 'brown', 'blue']
            },
            {
                name: '',
                type: 'L', //ETC(less)
                rating: '3.6',
                switch: ['red', 'brown']
            }
        ];
        return (state.keyboards = list);
    }
};
const actions = {
    //@todo call API code
};

export default {
    namespaced: true,
    state,
    getters,
    mutations,
    actions
};
