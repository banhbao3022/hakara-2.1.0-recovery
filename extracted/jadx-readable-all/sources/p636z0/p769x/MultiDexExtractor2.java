package p636z0.p769x;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p752p.C8310a;

/* JADX INFO: renamed from: z0.x.c, reason: use source file name */
/* JADX INFO: compiled from: MultiDexExtractor.java */
/* JADX INFO: loaded from: classes.dex */
public final class MultiDexExtractor2 implements Closeable {

    /* JADX INFO: renamed from: f */
    public final File f38975f;

    /* JADX INFO: renamed from: g */
    public final long f38976g;

    /* JADX INFO: renamed from: h */
    public final File f38977h;

    /* JADX INFO: renamed from: i */
    public final RandomAccessFile f38978i;

    /* JADX INFO: renamed from: j */
    public final FileChannel f38979j;

    /* JADX INFO: renamed from: k */
    public final FileLock f38980k;

    /* JADX INFO: renamed from: z0.x.c$a */
    /* JADX INFO: compiled from: MultiDexExtractor.java */
    public static class a extends File {

        /* JADX INFO: renamed from: f */
        public long f38981f;

        public a(File file, String str) {
            super(file, str);
            this.f38981f = -1L;
        }
    }

    public MultiDexExtractor2(File file, File file2) throws IOException {
        StringBuilder sbM1556G = outline.m1556G("MultiDexExtractor(");
        sbM1556G.append(file.getPath());
        sbM1556G.append(", ");
        sbM1556G.append(file2.getPath());
        sbM1556G.append(")");
        Log.i("MultiDex", sbM1556G.toString());
        this.f38975f = file;
        this.f38977h = file2;
        this.f38976g = m16899h(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f38978i = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.f38979j = channel;
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                this.f38980k = channel.lock();
                Log.i("MultiDex", file3.getPath() + " locked");
            } catch (IOException e) {
                e = e;
                m16896a(this.f38979j);
                throw e;
            } catch (Error e2) {
                e = e2;
                m16896a(this.f38979j);
                throw e;
            } catch (RuntimeException e3) {
                e = e3;
                m16896a(this.f38979j);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e4) {
            m16896a(this.f38978i);
            throw e4;
        }
    }

    /* JADX INFO: renamed from: H */
    public static void m16895H(Context context, String str, long j2, long j3, List<a> list) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("multidex.version", 4).edit();
        editorEdit.putLong(str + "timestamp", j2);
        editorEdit.putLong(outline.m1550A(new StringBuilder(), str, "crc"), j3);
        editorEdit.putInt(str + "dex.number", list.size() + 1);
        int i = 2;
        for (a aVar : list) {
            editorEdit.putLong(str + "dex.crc." + i, aVar.f38981f);
            editorEdit.putLong(str + "dex.time." + i, aVar.lastModified());
            i++;
        }
        editorEdit.commit();
    }

    /* JADX INFO: renamed from: a */
    public static void m16896a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("MultiDex", "Failed to close resource", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m16897c(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File fileCreateTempFile = File.createTempFile(outline.m1599u("tmp-", str), ".zip", file.getParentFile());
        StringBuilder sbM1556G = outline.m1556G("Extracting ");
        sbM1556G.append(fileCreateTempFile.getPath());
        Log.i("MultiDex", sbM1556G.toString());
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(fileCreateTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[16384];
                for (int i = inputStream.read(bArr); i != -1; i = inputStream.read(bArr)) {
                    zipOutputStream.write(bArr, 0, i);
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (!fileCreateTempFile.setReadOnly()) {
                    throw new IOException("Failed to mark readonly \"" + fileCreateTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
                }
                Log.i("MultiDex", "Renaming to " + file.getPath());
                if (fileCreateTempFile.renameTo(file)) {
                    m16896a(inputStream);
                    fileCreateTempFile.delete();
                    return;
                }
                throw new IOException("Failed to rename \"" + fileCreateTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
            } catch (Throwable th) {
                zipOutputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            m16896a(inputStream);
            fileCreateTempFile.delete();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: f */
    public static long m16898f(File file) {
        long jLastModified = file.lastModified();
        return jLastModified == -1 ? jLastModified - 1 : jLastModified;
    }

    /* JADX INFO: renamed from: h */
    public static long m16899h(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            ZipUtil zipUtilM16437b = C8310a.m16437b(randomAccessFile);
            CRC32 crc32 = new CRC32();
            long j2 = zipUtilM16437b.f38983b;
            randomAccessFile.seek(zipUtilM16437b.f38982a);
            byte[] bArr = new byte[16384];
            int i = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j2));
            while (i != -1) {
                crc32.update(bArr, 0, i);
                j2 -= (long) i;
                if (j2 == 0) {
                    break;
                }
                i = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j2));
            }
            long value = crc32.getValue();
            randomAccessFile.close();
            return value == -1 ? value - 1 : value;
        } catch (Throwable th) {
            randomAccessFile.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: B */
    public final List<a> m16900B(Context context, String str) throws IOException {
        Log.i("MultiDex", "loading existing secondary dex files");
        String str2 = this.f38975f.getName() + ".classes";
        SharedPreferences sharedPreferences = context.getSharedPreferences("multidex.version", 4);
        int i = sharedPreferences.getInt(str + "dex.number", 1);
        ArrayList arrayList = new ArrayList(i + (-1));
        int i2 = 2;
        while (i2 <= i) {
            a aVar = new a(this.f38977h, outline.m1592n(str2, i2, ".zip"));
            if (!aVar.isFile()) {
                StringBuilder sbM1556G = outline.m1556G("Missing extracted secondary dex file '");
                sbM1556G.append(aVar.getPath());
                sbM1556G.append("'");
                throw new IOException(sbM1556G.toString());
            }
            aVar.f38981f = m16899h(aVar);
            long j2 = sharedPreferences.getLong(str + "dex.crc." + i2, -1L);
            long j3 = sharedPreferences.getLong(str + "dex.time." + i2, -1L);
            long jLastModified = aVar.lastModified();
            if (j3 == jLastModified) {
                String str3 = str2;
                SharedPreferences sharedPreferences2 = sharedPreferences;
                if (j2 == aVar.f38981f) {
                    arrayList.add(aVar);
                    i2++;
                    sharedPreferences = sharedPreferences2;
                    str2 = str3;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid extracted dex: ");
            sb.append(aVar);
            sb.append(" (key \"");
            sb.append(str);
            sb.append("\"), expected modification time: ");
            sb.append(j3);
            outline.m1570U(sb, ", modification time: ", jLastModified, ", expected crc: ");
            sb.append(j2);
            sb.append(", file crc: ");
            sb.append(aVar.f38981f);
            throw new IOException(sb.toString());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: D */
    public final List<a> m16901D() throws IOException {
        String str = this.f38975f.getName() + ".classes";
        File[] fileArrListFiles = this.f38977h.listFiles(new MultiDexExtractor(this));
        if (fileArrListFiles == null) {
            StringBuilder sbM1556G = outline.m1556G("Failed to list secondary dex dir content (");
            sbM1556G.append(this.f38977h.getPath());
            sbM1556G.append(").");
            Log.w("MultiDex", sbM1556G.toString());
        } else {
            for (File file : fileArrListFiles) {
                StringBuilder sbM1556G2 = outline.m1556G("Trying to delete old file ");
                sbM1556G2.append(file.getPath());
                sbM1556G2.append(" of size ");
                sbM1556G2.append(file.length());
                Log.i("MultiDex", sbM1556G2.toString());
                if (file.delete()) {
                    StringBuilder sbM1556G3 = outline.m1556G("Deleted old file ");
                    sbM1556G3.append(file.getPath());
                    Log.i("MultiDex", sbM1556G3.toString());
                } else {
                    StringBuilder sbM1556G4 = outline.m1556G("Failed to delete old file ");
                    sbM1556G4.append(file.getPath());
                    Log.w("MultiDex", sbM1556G4.toString());
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.f38975f);
        int i = 2;
        try {
            ZipEntry entry = zipFile.getEntry("classes2.dex");
            while (entry != null) {
                a aVar = new a(this.f38977h, str + i + ".zip");
                arrayList.add(aVar);
                Log.i("MultiDex", "Extraction is needed for file " + aVar);
                int i2 = 0;
                boolean z = false;
                while (i2 < 3 && !z) {
                    i2++;
                    m16897c(zipFile, entry, aVar, str);
                    try {
                        aVar.f38981f = m16899h(aVar);
                        z = true;
                    } catch (IOException e) {
                        Log.w("MultiDex", "Failed to read crc from " + aVar.getAbsolutePath(), e);
                        z = false;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Extraction ");
                    sb.append(z ? "succeeded" : "failed");
                    sb.append(" '");
                    sb.append(aVar.getAbsolutePath());
                    sb.append("': length ");
                    sb.append(aVar.length());
                    sb.append(" - crc: ");
                    sb.append(aVar.f38981f);
                    Log.i("MultiDex", sb.toString());
                    if (!z) {
                        aVar.delete();
                        if (aVar.exists()) {
                            Log.w("MultiDex", "Failed to delete corrupted secondary dex '" + aVar.getPath() + "'");
                        }
                    }
                }
                if (!z) {
                    throw new IOException("Could not create zip file " + aVar.getAbsolutePath() + " for secondary dex (" + i + ")");
                }
                i++;
                entry = zipFile.getEntry("classes" + i + ".dex");
            }
            try {
                zipFile.close();
            } catch (IOException e2) {
                Log.w("MultiDex", "Failed to close resource", e2);
            }
            return arrayList;
        } catch (Throwable th) {
            try {
                zipFile.close();
            } catch (IOException e3) {
                Log.w("MultiDex", "Failed to close resource", e3);
            }
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f38980k.release();
        this.f38979j.close();
        this.f38978i.close();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x007b  */
    /* JADX WARN: Code duplicated, block: B:17:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x009e  */
    /* JADX WARN: Code duplicated, block: B:19:0x00a4  */
    /* JADX INFO: renamed from: u */
    public List<? extends File> m16902u(Context context, String str, boolean z) throws IOException {
        List<a> listM16901D;
        List<a> listM16900B;
        boolean z2;
        StringBuilder sbM1556G = outline.m1556G("MultiDexExtractor.load(");
        sbM1556G.append(this.f38975f.getPath());
        sbM1556G.append(", ");
        sbM1556G.append(z);
        sbM1556G.append(", ");
        sbM1556G.append(str);
        sbM1556G.append(")");
        Log.i("MultiDex", sbM1556G.toString());
        if (!this.f38980k.isValid()) {
            throw new IllegalStateException("MultiDexExtractor was closed");
        }
        if (z) {
            if (z) {
                Log.i("MultiDex", "Forced extraction must be performed.");
            } else {
                Log.i("MultiDex", "Detected that extraction must be performed.");
            }
            listM16901D = m16901D();
            m16895H(context, str, m16898f(this.f38975f), this.f38976g, listM16901D);
            listM16900B = listM16901D;
        } else {
            File file = this.f38975f;
            long j2 = this.f38976g;
            SharedPreferences sharedPreferences = context.getSharedPreferences("multidex.version", 4);
            if (sharedPreferences.getLong(str + "timestamp", -1L) == m16898f(file)) {
                if (sharedPreferences.getLong(str + "crc", -1L) != j2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = true;
            }
            if (z2) {
                if (z) {
                    Log.i("MultiDex", "Forced extraction must be performed.");
                } else {
                    Log.i("MultiDex", "Detected that extraction must be performed.");
                }
                listM16901D = m16901D();
                m16895H(context, str, m16898f(this.f38975f), this.f38976g, listM16901D);
            } else {
                try {
                    listM16900B = m16900B(context, str);
                } catch (IOException e) {
                    Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e);
                    listM16901D = m16901D();
                    m16895H(context, str, m16898f(this.f38975f), this.f38976g, listM16901D);
                    listM16900B = listM16901D;
                }
            }
            listM16900B = listM16901D;
        }
        StringBuilder sbM1556G2 = outline.m1556G("load found ");
        sbM1556G2.append(listM16900B.size());
        sbM1556G2.append(" secondary dex files");
        Log.i("MultiDex", sbM1556G2.toString());
        return listM16900B;
    }
}
