package p007c.p190n.p194b.p367f.p368a.p370b;

import com.google.android.play.core.assetpacks.AssetPackState;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.SequenceInputStream;
import java.util.Objects;
import java.util.zip.GZIPInputStream;
import p007c.p190n.p194b.p367f.p368a.p373d.C5084c0;
import p007c.p190n.p194b.p367f.p368a.p373d.C5089f;
import p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5086d0;

/* JADX INFO: renamed from: c.n.b.f.a.b.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5007h0 {

    /* JADX INFO: renamed from: a */
    public static final C5089f f25812a = new C5089f("ExtractChunkTaskHandler");

    /* JADX INFO: renamed from: b */
    public final byte[] f25813b = new byte[8192];

    /* JADX INFO: renamed from: c */
    public final C5056u f25814c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5086d0<InterfaceC5037o2> f25815d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC5086d0<C5046r> f25816e;

    /* JADX INFO: renamed from: f */
    public final C5027m0 f25817f;

    public C5007h0(C5056u c5056u, InterfaceC5086d0<InterfaceC5037o2> interfaceC5086d0, InterfaceC5086d0<C5046r> interfaceC5086d1, C5027m0 c5027m0) {
        this.f25814c = c5056u;
        this.f25815d = interfaceC5086d0;
        this.f25816e = interfaceC5086d1;
        this.f25817f = c5027m0;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x01ab  */
    /* JADX INFO: renamed from: a */
    public final void m11449a(C5003g0 c5003g0) {
        Throwable th;
        InputStream sequenceInputStream;
        double d;
        C5070y1 c5070y1M11427a;
        File fileM11479i;
        long length;
        int iMin;
        int iMax;
        long j2;
        int i;
        C5056u c5056u = this.f25814c;
        String str = c5003g0.f26031b;
        int i2 = c5003g0.f25791c;
        long j3 = c5003g0.f25792d;
        String str2 = c5003g0.f25793e;
        C5055t1 c5055t1 = new C5055t1(c5056u, str, i2, j3, str2);
        File fileM11501r = c5056u.m11501r(str, i2, j3, str2);
        if (!fileM11501r.exists()) {
            fileM11501r.mkdirs();
        }
        try {
            InputStream inputStream = c5003g0.f25799k;
            InputStream gZIPInputStream = c5003g0.f25794f != 1 ? inputStream : new GZIPInputStream(inputStream, 8192);
            try {
                try {
                    if (c5003g0.f25795g > 0) {
                        C5052s1 c5052s1M11475e = c5055t1.m11475e();
                        int i3 = c5052s1M11475e.f25954e;
                        int i4 = c5003g0.f25795g;
                        if (i3 != i4 - 1) {
                            throw new C5011i0(String.format("Trying to resume with chunk number %s when previously processed chunk was number %s.", Integer.valueOf(i4), Integer.valueOf(c5052s1M11475e.f25954e)), c5003g0.f26030a);
                        }
                        int i5 = c5052s1M11475e.f25950a;
                        try {
                            if (i5 == 1) {
                                f25812a.m11533b(3, "Resuming zip entry from last chunk during file %s.", new Object[]{c5052s1M11475e.f25951b});
                                File file = new File(c5052s1M11475e.f25951b);
                                if (!file.exists()) {
                                    throw new C5011i0("Partial file specified in checkpoint does not exist. Corrupt directory.", c5003g0.f26030a);
                                }
                                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                                randomAccessFile.seek(c5052s1M11475e.f25952c);
                                long j4 = c5052s1M11475e.f25953d;
                                while (true) {
                                    iMin = (int) Math.min(j4, 8192L);
                                    iMax = Math.max(gZIPInputStream.read(this.f25813b, 0, iMin), 0);
                                    if (iMax > 0) {
                                        randomAccessFile.write(this.f25813b, 0, iMax);
                                    }
                                    j2 = j4 - ((long) iMax);
                                    if (j2 <= 0 || iMax <= 0) {
                                        break;
                                    } else {
                                        j4 = j2;
                                    }
                                }
                                long length2 = randomAccessFile.length();
                                randomAccessFile.close();
                                if (iMax != iMin) {
                                    f25812a.m11533b(3, "Chunk has ended while resuming the previous chunks file content.", new Object[0]);
                                    c5055t1.m11471a(file.getCanonicalPath(), length2, j2, c5003g0.f25795g);
                                } else {
                                    gZIPInputStream = gZIPInputStream;
                                    sequenceInputStream = gZIPInputStream;
                                }
                            } else if (i5 == 2) {
                                f25812a.m11533b(3, "Resuming zip entry from last chunk during local file header.", new Object[0]);
                                C5056u c5056u2 = this.f25814c;
                                String str3 = c5003g0.f26031b;
                                int i6 = c5003g0.f25791c;
                                long j5 = c5003g0.f25792d;
                                String str4 = c5003g0.f25793e;
                                Objects.requireNonNull(c5056u2);
                                File file2 = new File(c5056u2.m11501r(str3, i6, j5, str4), "checkpoint_ext.dat");
                                if (!file2.exists()) {
                                    throw new C5011i0("Checkpoint extension file not found.", c5003g0.f26030a);
                                }
                                gZIPInputStream = gZIPInputStream;
                                sequenceInputStream = new SequenceInputStream(new FileInputStream(file2), gZIPInputStream);
                            } else {
                                if (i5 != 3) {
                                    throw new C5011i0(String.format("Slice checkpoint file corrupt. Unexpected FileExtractionStatus %s.", Integer.valueOf(c5052s1M11475e.f25950a)), c5003g0.f26030a);
                                }
                                f25812a.m11533b(3, "Resuming central directory from last chunk.", new Object[0]);
                                long j6 = c5052s1M11475e.f25952c;
                                RandomAccessFile randomAccessFile2 = new RandomAccessFile(c5055t1.m11479i(), "rw");
                                try {
                                    randomAccessFile2.seek(j6);
                                    do {
                                        i = gZIPInputStream.read(c5055t1.f25964b);
                                        if (i > 0) {
                                            randomAccessFile2.write(c5055t1.f25964b, 0, i);
                                        }
                                    } while (i == 8192);
                                    randomAccessFile2.close();
                                    if (!c5003g0.m11444a()) {
                                        throw new C5011i0("Chunk has ended twice during central directory. This should not be possible with chunk sizes of 50MB.", c5003g0.f26030a);
                                    }
                                } catch (Throwable th2) {
                                    try {
                                        randomAccessFile2.close();
                                        throw th2;
                                    } catch (Throwable th3) {
                                        C5084c0.f26038a.mo11527a(th2, th3);
                                        throw th2;
                                    }
                                }
                            }
                            sequenceInputStream = null;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                        th = th;
                        try {
                            gZIPInputStream.close();
                            throw th;
                        } catch (Throwable th5) {
                            C5084c0.f26038a.mo11527a(th, th5);
                            throw th;
                        }
                    }
                    gZIPInputStream = gZIPInputStream;
                    sequenceInputStream = gZIPInputStream;
                    if (sequenceInputStream != null) {
                        C4987c0 c4987c0 = new C4987c0(sequenceInputStream);
                        File fileM11450b = m11450b(c5003g0);
                        do {
                            c5070y1M11427a = c4987c0.m11427a();
                            if (!c5070y1M11427a.f26024d && !c4987c0.f25713j) {
                                if (!c5070y1M11427a.m11523b() || c5070y1M11427a.m11522a()) {
                                    c5055t1.m11477g(c5070y1M11427a.f26026f, c4987c0);
                                } else {
                                    c5055t1.m11476f(c5070y1M11427a.f26026f);
                                    File file3 = new File(fileM11450b, c5070y1M11427a.f26021a);
                                    file3.getParentFile().mkdirs();
                                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                                    int i7 = c4987c0.read(this.f25813b);
                                    while (i7 > 0) {
                                        fileOutputStream.write(this.f25813b, 0, i7);
                                        i7 = c4987c0.read(this.f25813b);
                                    }
                                    fileOutputStream.close();
                                }
                            }
                            if (c4987c0.f25712i) {
                                break;
                            }
                        } while (!c4987c0.f25713j);
                        if (c4987c0.f25713j) {
                            f25812a.m11533b(3, "Writing central directory metadata.", new Object[0]);
                            c5055t1.m11477g(c5070y1M11427a.f26026f, sequenceInputStream);
                        }
                        if (!c5003g0.m11444a()) {
                            if (c5070y1M11427a.f26024d) {
                                f25812a.m11533b(3, "Writing slice checkpoint for partial local file header.", new Object[0]);
                                c5055t1.m11472b(c5070y1M11427a.f26026f, c5003g0.f25795g);
                            } else if (c4987c0.f25713j) {
                                f25812a.m11533b(3, "Writing slice checkpoint for central directory.", new Object[0]);
                                c5055t1.m11473c(c5003g0.f25795g);
                            } else {
                                if (c5070y1M11427a.f26023c == 0) {
                                    f25812a.m11533b(3, "Writing slice checkpoint for partial file.", new Object[0]);
                                    fileM11479i = new File(m11450b(c5003g0), c5070y1M11427a.f26021a);
                                    length = c5070y1M11427a.f26022b - c4987c0.f25711h;
                                    if (fileM11479i.length() != length) {
                                        throw new C5011i0("Partial file is of unexpected size.");
                                    }
                                } else {
                                    f25812a.m11533b(3, "Writing slice checkpoint for partial unextractable file.", new Object[0]);
                                    fileM11479i = c5055t1.m11479i();
                                    length = fileM11479i.length();
                                }
                                c5055t1.m11471a(fileM11479i.getCanonicalPath(), length, c4987c0.f25711h, c5003g0.f25795g);
                            }
                        }
                    }
                    gZIPInputStream.close();
                    if (c5003g0.m11444a()) {
                        try {
                            c5055t1.m11474d(c5003g0.f25795g);
                        } catch (IOException e) {
                            f25812a.m11533b(6, "Writing extraction finished checkpoint failed with %s.", new Object[]{e.getMessage()});
                            throw new C5011i0("Writing extraction finished checkpoint failed.", e, c5003g0.f26030a);
                        }
                    }
                    f25812a.m11533b(4, "Extraction finished for chunk %s of slice %s of pack %s of session %s.", new Object[]{Integer.valueOf(c5003g0.f25795g), c5003g0.f25793e, c5003g0.f26031b, Integer.valueOf(c5003g0.f26030a)});
                    this.f25815d.m11529a().mo11435c(c5003g0.f26030a, c5003g0.f26031b, c5003g0.f25793e, c5003g0.f25795g);
                    try {
                        c5003g0.f25799k.close();
                    } catch (IOException unused) {
                        f25812a.m11533b(5, "Could not close file for chunk %s of slice %s of pack %s.", new Object[]{Integer.valueOf(c5003g0.f25795g), c5003g0.f25793e, c5003g0.f26031b});
                    }
                    if (c5003g0.f25798j == 3) {
                        C5046r c5046rM11529a = this.f25816e.m11529a();
                        String str5 = c5003g0.f26031b;
                        long j7 = c5003g0.f25797i;
                        C5027m0 c5027m0 = this.f25817f;
                        synchronized (c5027m0) {
                            d = (((double) c5003g0.f25795g) + 1.0d) / ((double) c5003g0.f25796h);
                            c5027m0.f25874a.put(str5, Double.valueOf(d));
                        }
                        c5046rM11529a.f25940n.post(new RunnableC5034o(c5046rM11529a, AssetPackState.m12910d(str5, 3, 0, j7, j7, d, 1, "")));
                    }
                } catch (Throwable th6) {
                    th = th6;
                    th = th;
                }
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (IOException e2) {
            f25812a.m11533b(6, "IOException during extraction %s.", new Object[]{e2.getMessage()});
            throw new C5011i0(String.format("Error extracting chunk %s of slice %s of pack %s of session %s.", Integer.valueOf(c5003g0.f25795g), c5003g0.f25793e, c5003g0.f26031b, Integer.valueOf(c5003g0.f26030a)), e2, c5003g0.f26030a);
        }
    }

    /* JADX INFO: renamed from: b */
    public final File m11450b(C5003g0 c5003g0) {
        File fileM11495l = this.f25814c.m11495l(c5003g0.f26031b, c5003g0.f25791c, c5003g0.f25792d, c5003g0.f25793e);
        if (!fileM11495l.exists()) {
            fileM11495l.mkdirs();
        }
        return fileM11495l;
    }
}
