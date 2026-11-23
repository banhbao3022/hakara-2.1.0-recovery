package p007c.p190n.p194b.p209b.p252x1;

import java.util.List;
import java.util.Objects;
import p007c.p190n.p194b.p209b.p217p1.OutputBuffer;

/* JADX INFO: renamed from: c.n.b.b.x1.k, reason: use source file name */
/* JADX INFO: compiled from: SubtitleOutputBuffer.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class SubtitleOutputBuffer extends OutputBuffer implements Subtitle {

    /* JADX INFO: renamed from: h */
    public Subtitle f9822h;

    /* JADX INFO: renamed from: i */
    public long f9823i;

    @Override // p007c.p190n.p194b.p209b.p252x1.Subtitle
    /* JADX INFO: renamed from: f */
    public int mo4395f(long j2) {
        Subtitle subtitle = this.f9822h;
        Objects.requireNonNull(subtitle);
        return subtitle.mo4395f(j2 - this.f9823i);
    }

    @Override // p007c.p190n.p194b.p209b.p252x1.Subtitle
    /* JADX INFO: renamed from: h */
    public long mo4396h(int i) {
        Subtitle subtitle = this.f9822h;
        Objects.requireNonNull(subtitle);
        return subtitle.mo4396h(i) + this.f9823i;
    }

    @Override // p007c.p190n.p194b.p209b.p252x1.Subtitle
    /* JADX INFO: renamed from: j */
    public List<Cue> mo4397j(long j2) {
        Subtitle subtitle = this.f9822h;
        Objects.requireNonNull(subtitle);
        return subtitle.mo4397j(j2 - this.f9823i);
    }

    @Override // p007c.p190n.p194b.p209b.p252x1.Subtitle
    /* JADX INFO: renamed from: l */
    public int mo4398l() {
        Subtitle subtitle = this.f9822h;
        Objects.requireNonNull(subtitle);
        return subtitle.mo4398l();
    }

    /* JADX INFO: renamed from: y */
    public void m4399y() {
        this.f7262f = 0;
        this.f9822h = null;
    }

    /* JADX INFO: renamed from: z */
    public void m4400z(long j2, Subtitle subtitle, long j3) {
        this.f7298g = j2;
        this.f9822h = subtitle;
        if (j3 != Long.MAX_VALUE) {
            j2 = j3;
        }
        this.f9823i = j2;
    }
}
