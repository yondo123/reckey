<template>
        <header>
            <h1 class="title">RECKEY.net</h1>
            <button type="button"><i class="fas fa-bars"></i></button>
            <a href="#" class="main-link">RECKEY.net</a>
            <button type="button"><i class="fas fa-user"></i></button>
        </header>
</template>
<script>
export default {}
</script>
<style scoped>
.title { 
    display: none;
}

.main-link {
    color: var(--icon-color);
    font-weight: 600;
    font-size: 1.8rem;
}

header {
    margin: 0 !important;
    background-color: var(--accent-color);
    display: flex;
    justify-content: space-between;
    margin-top: 2.8rem;
    padding : 0.4rem;
}

header button {
    border-style: none;
    background-color: var(--accent-color);
}

header button:hover {
    background-color: var(--icon-hover-color);
    color : #fff;
    transition: color, 750ms;
}

</style>