<template>
    <main>
        <div class="company">
            <strong>Leopold</strong>
        </div>
        <ol class="keyboards">
            <li class="item">
                <a href="#">
                    <div class="product">
                        <div class="product-name">
                            <strong>FC700R</strong>
                            <div class="record-on"></div>
                        </div>
                        <div class="product-detail">
                            <span class="rating">10.0</span>
                            <span class="type">10key</span>
                        </div>
                    </div>
                </a>
            </li>
        </ol>
    </main>
</template>

<script>
export default {};
</script>
<style scoped>
main {
    margin: 0 auto;
    overflow-y: scroll;
    height: 64rem;
}

.company {
    color: var(--main-color);
    font-size: 1.8rem;
    margin-top: 1rem;
    margin-bottom: 0.5rem;
}

main::-webkit-scrollbar {
    display: none;
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
    position: relative;
    height: 8rem;
    border: 1px solid var(--border-color);
    border-radius: 1rem;
    margin-top: 3.5rem;
}

.item > a {
    position: absolute;
    top: 50%;
    transform: translateY(-50%);
    color: var(--font-color);
    display: flex;
}

.record-on {
    margin: 0;
    display: inline-block;
    background-color: var(--red-key-color);
    margin: 0.6rem 0;
    width: 0.8rem;
    height: 0.8rem;
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
