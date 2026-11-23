package androidx.media;

import android.media.AudioAttributes;
import java.util.Objects;
import p636z0.p692g0.VersionedParcel;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(VersionedParcel versionedParcel) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f802a = (AudioAttributes) versionedParcel.m15634m(audioAttributesImplApi26.f802a, 1);
        audioAttributesImplApi26.f803b = versionedParcel.m15632k(audioAttributesImplApi26.f803b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, VersionedParcel versionedParcel) {
        Objects.requireNonNull(versionedParcel);
        AudioAttributes audioAttributes = audioAttributesImplApi26.f802a;
        versionedParcel.mo15637p(1);
        versionedParcel.mo15642u(audioAttributes);
        int i = audioAttributesImplApi26.f803b;
        versionedParcel.mo15637p(2);
        versionedParcel.mo15641t(i);
    }
}
