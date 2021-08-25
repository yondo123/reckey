<template>
    <section class="write-wrap" v-bind:class="{hide: closed}">
        <div class="interactive">
            <div class="rating-wrap" ref="rate">
                <button type="button" class="rate-button" v-on:click="setRate(1)">
                    <span v-if="rating >= 1"><i class="fas fa-2x fa-star rate"></i></span>
                </button>
                <button type="button" class="rate-button" v-on:click="setRate(2)">
                    <span v-if="rating < 2"><i class="far fa-2x fa-star rate"></i></span>
                    <span v-if="rating >= 2"><i class="fas fa-2x fa-star rate"></i></span>
                </button>
                <button type="button" class="rate-button" v-on:click="setRate(3)">
                    <span v-if="rating < 3"><i class="far fa-2x fa-star rate"></i></span>
                    <span v-if="rating >= 3"><i class="fas fa-2x fa-star rate"></i></span>
                </button>
                <button type="button" class="rate-button" v-on:click="setRate(4)">
                    <span v-if="rating < 4"><i class="far fa-2x fa-star rate"></i></span>
                    <span v-if="rating >= 4"><i class="fas fa-2x fa-star rate"></i></span>
                </button>
                <button type="button" class="rate-button" v-on:click="setRate(5)">
                    <span v-if="rating < 5"><i class="far fa-2x fa-star rate"></i></span>
                    <span v-if="rating >= 5"><i class="fas fa-2x fa-star rate"></i></span>
                </button>
            </div>
            <button type="button" class="btn-mic" v-bind:class="{hide: isRecord == 'R' || isRecord == 'C'}" v-on:click="recordStart">
                <i class="fas fa-2x fa-microphone"></i>
            </button>
            <button type="button" class="btn-mic" v-bind:class="{hide: isRecord == 'I' || isRecord == 'C'}" v-on:click="recordStop">
                <i class="fas fa-2x fa-stop"></i>
            </button>
            <button type="button" class="btn-mic" v-bind:class="{hide: isRecord == 'I' || isRecord == 'R'}" v-on:click="recordPlay">
                <i class="fas fa-2x fa-play-circle"></i>
            </button>
            <audio src="" ref="audio"></audio>
        </div>
        <textarea name="review" id="review-area" cols="15" rows="10" v-model="review"> </textarea>
        <div class="article-button">
            <button type="button" class="write">등록</button>
            <button type="button" class="cancel" v-on:click="closePopup">취소</button>
        </div>
    </section>
</template>

<script>
import AudioRecorder from 'audio-recorder-polyfill';
export default {
    data() {
        return {
            // I : init, R : Recording, C : Complete
            isRecord: 'I',
            recorder: null,
            closed: false,
            rating: 1,
            review: ''
        };
    },
    methods: {
        recordStart: function () {
            if (MediaRecorder.notSupported) {
                alert('녹음기능을 사용할 수 없는 브라우저입니다.');
            } else {
                navigator.mediaDevices.getUserMedia({audio: true}).then(stream => {
                    this.recorder = new MediaRecorder(stream);

                    this.recorder.addEventListener('dataavailable', e => {
                        this.$refs.audio.src = URL.createObjectURL(e.data);
                    });

                    this.recorder.start();
                    this.isRecord = 'R';
                });
            }
            console.log('RECORD-START');
        },
        recordStop: function () {
            console.log('RECORD-STOP');
            this.isRecord = 'C';
            this.recorder.stop();
            this.recorder.stream.getTracks().forEach(i => i.stop());
        },
        recordPlay: function () {
            console.log('RECORD-PLAY!');
            const $audio = this.$refs.audio;
            $audio.play();
        },
        closePopup: function () {
            this.closed = true;
        },
        setRate: function (starRate) {
            this.rating = starRate;
        }
    },
    mounted() {
        Window.MediaRecorder = AudioRecorder;
    }
};
</script>

<style scoped>
.rate-button {
    background: none;
    color: inherit;
    border: none;
    padding: 0;
    font: inherit;
    cursor: pointer;
    outline: inherit;
}
.rate {
    cursor: pointer;
    color: var(--icon-color);
}
.btn-mic {
    background-color: var(--icon-color);
}
</style>
