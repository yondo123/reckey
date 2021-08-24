<template>
    <section class="write-wrap" v-bind:class="{hide: closed}">
        <div class="interactive">
            <div class="rating-wrap">
                <i class="fas fa-2x fa-star star"></i>
                <i class="fas fa-2x fa-star star"></i>
                <i class="fas fa-2x fa-star star"></i>
                <i class="fas fa-2x fa-star star"></i>
                <i class="far fa-2x fa-star unstar"></i>
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
        <textarea name="review" id="review-area" cols="15" rows="10"> </textarea>
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
            closed: false
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
        }
    },
    mounted() {
        Window.MediaRecorder = AudioRecorder;
    }
};
</script>

<style scoped>
.btn-mic {
    background-color: var(--icon-color);
}
</style>
