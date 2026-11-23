package p007c.p085g.p086a.p089m.p098v.p102g;

import java.io.File;
import java.io.IOException;
import p007c.p085g.p086a.p089m.Options;
import p007c.p085g.p086a.p089m.ResourceDecoder;
import p007c.p085g.p086a.p089m.p092t.Resource2;

/* JADX INFO: renamed from: c.g.a.m.v.g.a, reason: use source file name */
/* JADX INFO: compiled from: FileDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public class FileDecoder implements ResourceDecoder<File, File> {
    @Override // p007c.p085g.p086a.p089m.ResourceDecoder
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo1709a(File file, Options options) throws IOException {
        return true;
    }

    @Override // p007c.p085g.p086a.p089m.ResourceDecoder
    /* JADX INFO: renamed from: b */
    public Resource2<File> mo1710b(File file, int i, int i2, Options options) throws IOException {
        return new FileResource(file);
    }
}
