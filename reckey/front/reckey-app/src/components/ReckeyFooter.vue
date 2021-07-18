<template>
    <footer>
        <ul class="footer-link">
            <li>
                <a href="#">
                    about
                </a>
            </li>
            <li>
                <a href="#">
                    login
                </a>
            </li>
        </ul>
    </footer>
</template>

<script>
export default {

}
</script>

<style scoped>
footer {
    margin: 0 3.5416666666666665%;
    position: relative;
    bottom: 0;
    width: 90%;
}

.footer-link {
    display: flex;
    justify-content: center;
    padding: 0;
    list-style: none;
    border-top: 1px solid var(--border-color);
}

.footer-link li {
    padding : 1rem 0;
    margin-right: 1rem;
}

.footer-link a{
    color: var(--main-color);
    font-size: 1.2rem;
}

.hide{
    display: none !important;
}
</style>