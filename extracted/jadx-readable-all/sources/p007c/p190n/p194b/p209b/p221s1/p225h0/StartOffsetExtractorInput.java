package p007c.p190n.p194b.p209b.p221s1.p225h0;

import p007c.p190n.p194b.p209b.p221s1.ExtractorInput;
import p007c.p190n.p194b.p209b.p221s1.ForwardingExtractorInput;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.s1.h0.c, reason: use source file name */
/* JADX INFO: compiled from: StartOffsetExtractorInput.java */
/* JADX INFO: loaded from: classes.dex */
public final class StartOffsetExtractorInput extends ForwardingExtractorInput {

    /* JADX INFO: renamed from: b */
    public final long f7668b;

    public StartOffsetExtractorInput(ExtractorInput extractorInput, long j2) {
        super(extractorInput);
        C2096e.m4566b(extractorInput.mo3740p() >= j2);
        this.f7668b = j2;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.ForwardingExtractorInput, p007c.p190n.p194b.p209b.p221s1.ExtractorInput
    /* JADX INFO: renamed from: a */
    public long mo3729a() {
        return super.mo3729a() - this.f7668b;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.ForwardingExtractorInput, p007c.p190n.p194b.p209b.p221s1.ExtractorInput
    /* JADX INFO: renamed from: e */
    public long mo3732e() {
        return super.mo3732e() - this.f7668b;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.ForwardingExtractorInput, p007c.p190n.p194b.p209b.p221s1.ExtractorInput
    /* JADX INFO: renamed from: p */
    public long mo3740p() {
        return super.mo3740p() - this.f7668b;
    }
}
