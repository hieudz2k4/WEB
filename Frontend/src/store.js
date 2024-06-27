import Vuex from 'vuex'

var store = new Vuex.Store({
    state: {
        showLogIn: false
    },
    mutations: {
        changeShowLogIn(state) {
            state.showLogIn = !state.showLogIn
        }
    },
})
export default store;