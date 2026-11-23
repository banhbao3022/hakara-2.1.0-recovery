package androidx.media;

import android.media.AudioAttributes;
import java.util.Objects;
import p636z0.p692g0.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(VersionedParcel versionedParcel) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f802a = (AudioAttributes) versionedParcel.m15634m(audioAttributesImplApi21.f802a, 1);
        audioAttributesImplApi21.f803b = versionedParcel.m15632k(audioAttributesImplApi21.f803b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, VersionedParcel versionedParcel) {
        Objects.requireNonNull(versionedParcel);
        AudioAttributes audioAttributes = audioAttributesImplApi21.f802a;
        versionedParcel.mo15637p(1);
        versionedParcel.mo15642u(audioAttributes);
        int i = audioAttributesImplApi21.f803b;
        versionedParcel.mo15637p(2);
        versionedParcel.mo15641t(i);
    }
}
