<template>
    <!-- 팝업모드 시 class="popup" -->
    <main class="popup">
        <div class="model">
            <strong>Leopold FC900R</strong>
        </div>
        <div class="keyboard-info">
            <div class="image">
                <img src="../assets/img/model.jpg" alt="FC900R" />
            </div>
            <div class="detail">
                <span class="type-blue key">10 KEY</span>
                <span class="price">129,000</span>
            </div>
            <ul class="review-list">
                <li class="review-item">
                    <div class="info">
                        <strong class="writer">admin</strong>
                        <p class="summary">
                            키보드 정말 좋긴하지만 가끔식은 통울림이..
                            <button type="button" class="btn-spread"><i class="fas fa-caret-down"></i></button>
                        </p>
                    </div>
                    <!-- 레코드 존재 : recplay, 레코드 파일 미존재 : recnone -->
                    <button type="button" class="btn-recplay">
                        <i class="fas fa-2x fa-play-circle"></i>
                    </button>
                </li>
            </ul>
        </div>
    </main>
</template>

<script scope>
export default {};
</script>

<style></style>
