package androidx.media;

import android.media.AudioAttributes;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a */
    public AudioAttributes f802a;

    /* JADX INFO: renamed from: b */
    public int f803b;

    public AudioAttributesImplApi21() {
        this.f803b = -1;
    }

    @Override // androidx.media.AudioAttributesImpl
    /* JADX INFO: renamed from: a */
    public Object mo440a() {
        return this.f802a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f802a.equals(((AudioAttributesImplApi21) obj).f802a);
        }
        return false;
    }

    public int hashCode() {
        return this.f802a.hashCode();
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("AudioAttributesCompat: audioattributes=");
        sbM1556G.append(this.f802a);
        return sbM1556G.toString();
    }

    /* JADX INFO: renamed from: androidx.media.AudioAttributesImplApi21$a */
    public static class C0129a implements AudioAttributesImpl.InterfaceC0128a {

        /* JADX INFO: renamed from: a */
        public final AudioAttributes.Builder f804a;

        public C0129a() {
            this.f804a = new AudioAttributes.Builder();
        }

        @Override // androidx.media.AudioAttributesImpl.InterfaceC0128a
        /* JADX INFO: renamed from: a */
        public AudioAttributesImpl mo441a() {
            return new AudioAttributesImplApi21(this.f804a.build());
        }

        @Override // androidx.media.AudioAttributesImpl.InterfaceC0128a
        /* JADX INFO: renamed from: b */
        public AudioAttributesImpl.InterfaceC0128a mo442b(int i) {
            this.f804a.setLegacyStreamType(i);
            return this;
        }

        public C0129a(Object obj) {
            this.f804a = new AudioAttributes.Builder((AudioAttributes) obj);
        }
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this.f803b = -1;
        this.f802a = audioAttributes;
        this.f803b = -1;
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes, int i) {
        this.f803b = -1;
        this.f802a = audioAttributes;
        this.f803b = i;
    }
}
