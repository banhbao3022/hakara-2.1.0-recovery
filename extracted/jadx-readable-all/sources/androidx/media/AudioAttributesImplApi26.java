package androidx.media;

import android.media.AudioAttributes;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi26 extends AudioAttributesImplApi21 {

    /* JADX INFO: renamed from: androidx.media.AudioAttributesImplApi26$a */
    public static class C0130a extends AudioAttributesImplApi21.C0129a {
        public C0130a() {
        }

        @Override // androidx.media.AudioAttributesImplApi21.C0129a, androidx.media.AudioAttributesImpl.InterfaceC0128a
        /* JADX INFO: renamed from: a */
        public AudioAttributesImpl mo441a() {
            return new AudioAttributesImplApi26(this.f804a.build());
        }

        public C0130a(Object obj) {
            super(obj);
        }
    }

    public AudioAttributesImplApi26() {
    }

    public AudioAttributesImplApi26(AudioAttributes audioAttributes) {
        super(audioAttributes, -1);
    }
}
