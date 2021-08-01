<template>
    <main>
        <div class="sort">
            <select name="sort" id="sort-by">
                <option value="rate">평점 순</option>
                <option value="latest">최신 순</option>
            </select>
        </div>
        <ol class="keyboards">
            <li class="item" v-for="(item, index) in keyboards" :key="index">
                <a href="#">
                    <img src="../assets/img/leopold.png" alt="leopold" />
                    <div class="product">
                        <div class="product-name">
                            <strong>{{ item.name }}</strong>
                        </div>
                        <div class="product-detail">
                            <span class="rating">{{ item.rating }}</span>
                            <span class="type">10key</span>
                        </div>
                    </div>
                </a>
            </li>
        </ol>
    </main>
</template>

<script>
import {mapGetters} from 'vuex';
export default {
    computed: {
        ...mapGetters('keyboard', {keyboards: 'getKeyboardList'})
    }
};
</script>

<style scoped>
main {
    width: 90%;
    margin: 0 3.5416666666666665%;
    overflow-y: scroll;
}

main::-webkit-scrollbar {
    display: none;
}

.sort select {
    padding: 0 1rem;
    -webkit-appearance: none;
    margin-top: 1.4rem;
    border-radius: 1rem;
    background-color: var(--accent-color);
    color: #fff;
}

.keyboards {
    padding: 0;
    list-style: none;
    border-top: 1px solid var(--border-color);
}

.item:first-child {
    margin-top: 1.75rem;
}

.item {
    height: 8rem;
    border: 1px solid var(--border-color);
    border-radius: 1rem;
    margin-top: 3.5rem;
}

.item > a {
    color: var(--font-color);
    display: flex;
    align-items: center;
}

.item img {
    border: 1px solid var(--border-color);
    margin: 0.6rem;
    width: 6.4rem;
    height: 6.4rem;
    border-radius: 50%;
}

.product-name {
    font-size: 1.4rem;
    font-weight: 700;
    padding-left: 1rem;
}

.product-detail {
    font-size: 1.2rem;
    margin-top: 1rem;
    padding-left: 1rem;
}

.rating,
.type {
    padding: 0 0.5rem;
    border: 1px solid var(--main-color);
    border-radius: 1rem;
}

.rating {
    margin-right: 1rem;
    color: #fff;
    width: 2rem;
    background-color: var(--main-color);
}

.type {
    color: #fff;
    background-color: var(--red-key-color);
}
</style>
