package p007c.p190n.p194b.p209b.p217p1;

import p007c.p190n.p194b.p209b.p217p1.DecoderException;

/* JADX INFO: renamed from: c.n.b.b.p1.c, reason: use source file name */
/* JADX INFO: compiled from: Decoder.java */
/* JADX INFO: loaded from: classes.dex */
public interface Decoder<I, O, E extends DecoderException> {
    /* JADX INFO: renamed from: b */
    O mo3630b() throws DecoderException;

    /* JADX INFO: renamed from: c */
    I mo3631c() throws DecoderException;

    /* JADX INFO: renamed from: d */
    void mo3632d(I i) throws DecoderException;

    void flush();

    void release();
}
