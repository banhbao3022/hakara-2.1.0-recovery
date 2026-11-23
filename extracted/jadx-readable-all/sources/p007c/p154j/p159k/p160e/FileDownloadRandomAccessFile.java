package p007c.p154j.p159k.p160e;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: renamed from: c.j.k.e.a, reason: use source file name */
/* JADX INFO: compiled from: FileDownloadRandomAccessFile.java */
/* JADX INFO: loaded from: classes.dex */
public class FileDownloadRandomAccessFile {

    /* JADX INFO: renamed from: a */
    public final BufferedOutputStream f4454a;

    /* JADX INFO: renamed from: b */
    public final FileDescriptor f4455b;

    /* JADX INFO: renamed from: c */
    public final RandomAccessFile f4456c;

    public FileDownloadRandomAccessFile(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        this.f4456c = randomAccessFile;
        this.f4455b = randomAccessFile.getFD();
        this.f4454a = new BufferedOutputStream(new FileOutputStream(randomAccessFile.getFD()));
    }
}
