package p007c.p114h.p126d.p129c.p139g;

import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.facebook.stetho.common.Utf8Charset;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import p007c.p071d.p078c.p079a.outline;
import p007c.p114h.p122b.C0868a;

/* JADX INFO: renamed from: c.h.d.c.g.d, reason: use source file name */
/* JADX INFO: compiled from: ResourceCodec.java */
/* JADX INFO: loaded from: classes.dex */
public class ResourceCodec {

    /* JADX INFO: renamed from: a */
    public String f4196a;

    /* JADX INFO: renamed from: b */
    public String f4197b;

    /* JADX INFO: renamed from: c */
    public Map<String, Pair<Integer, Integer>> f4198c;

    /* JADX INFO: renamed from: d */
    public ByteBuffer f4199d;

    /* JADX INFO: renamed from: c.h.d.c.g.d$a */
    /* JADX INFO: compiled from: ResourceCodec.java */
    public class a implements Comparator<b> {
        @Override // java.util.Comparator
        public int compare(b bVar, b bVar2) {
            return bVar.f4200a.compareTo(bVar2.f4200a);
        }
    }

    /* JADX INFO: renamed from: c.h.d.c.g.d$b */
    /* JADX INFO: compiled from: ResourceCodec.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        public String f4200a;

        /* JADX INFO: renamed from: b */
        public long f4201b;

        public b(String str, long j2) {
            this.f4200a = str;
            this.f4201b = j2;
        }
    }

    public ResourceCodec(String str, String str2) {
        this.f4196a = str;
        this.f4197b = str2;
    }

    /* JADX INFO: renamed from: a */
    public static Map<String, ArrayList<b>> m2165a(InputStream inputStream) throws IOException {
        HashMap map = new HashMap();
        ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(inputStream));
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    return map;
                }
                if (!nextEntry.isDirectory() && !nextEntry.getName().endsWith(".DS_Store") && !nextEntry.getName().contains("__MACOSX") && !C0868a.m2109e(nextEntry.getName()).startsWith(".") && nextEntry.getName().endsWith(".png")) {
                    String strM2108d = C0868a.m2108d(nextEntry.getName());
                    ArrayList arrayList = (ArrayList) map.get(strM2108d);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        map.put(strM2108d, arrayList);
                    }
                    int i = 0;
                    while (true) {
                        int i2 = zipInputStream.read(bArr);
                        if (i2 == -1) {
                            break;
                        }
                        i += i2;
                    }
                    arrayList.add(new b(nextEntry.getName(), i));
                }
            }
        } finally {
            zipInputStream.close();
        }
    }

    /* JADX INFO: renamed from: b */
    public static Pair<String, String> m2166b(String str) {
        String[] list = new File(str).list();
        if (list == null) {
            return null;
        }
        String str2 = null;
        String str3 = null;
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals("index.idx")) {
                str2 = list[i];
            } else if (list[i].equals("resource.res")) {
                str3 = list[i];
            }
        }
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return null;
        }
        return new Pair<>(str2, str3);
    }

    /* JADX INFO: renamed from: d */
    public static void m2167d(InputStream inputStream, File file, Map<String, ArrayList<b>> map) throws Throwable {
        FileOutputStream fileOutputStream;
        boolean z;
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        for (Map.Entry<String, ArrayList<b>> entry : map.entrySet()) {
            Collections.sort(entry.getValue(), new a());
            C0868a.m2111g(file + "/" + entry.getKey());
            HashMap map4 = new HashMap();
            HashMap map5 = new HashMap();
            int i = 16;
            for (b bVar : entry.getValue()) {
                String strM2109e = C0868a.m2109e(bVar.f4200a);
                map4.put(strM2109e, Integer.valueOf(i));
                map5.put(strM2109e, Integer.valueOf((int) bVar.f4201b));
                i += (int) bVar.f4201b;
            }
            map3.put(entry.getKey(), map4);
            StringBuilder sb = new StringBuilder();
            for (Map.Entry entry2 : map4.entrySet()) {
                sb.append((String) entry2.getKey());
                sb.append(':');
                sb.append(entry2.getValue());
                sb.append(':');
                sb.append(map5.get(entry2.getKey()));
                sb.append(';');
            }
            FileOutputStream fileOutputStream2 = null;
            try {
                try {
                    fileOutputStream = new FileOutputStream(new File(file + "/" + entry.getKey(), "index.idx"));
                    try {
                        fileOutputStream.write(sb.toString().getBytes(Utf8Charset.NAME));
                        C0868a.m2114j(fileOutputStream);
                        z = true;
                    } catch (Exception e) {
                        e = e;
                        fileOutputStream2 = fileOutputStream;
                        Log.e("ResourceCodec", "writeLinesToFile failed!", e);
                        C0868a.m2114j(fileOutputStream2);
                        z = false;
                    } catch (Throwable th) {
                        th = th;
                        C0868a.m2114j(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = null;
                }
            } catch (Exception e2) {
                e = e2;
            }
            if (!z) {
                throw new IOException("write index file failed!");
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(new File(file + "/" + entry.getKey(), "resource.res"), "rw");
            for (int i2 = 0; i2 < 16; i2++) {
                randomAccessFile.write(0);
            }
            map2.put(entry.getKey(), randomAccessFile);
        }
        ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(inputStream));
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    zipInputStream.close();
                    Iterator it = map2.entrySet().iterator();
                    while (it.hasNext()) {
                        C0868a.m2114j((Closeable) ((Map.Entry) it.next()).getValue());
                    }
                    return;
                }
                if (!nextEntry.isDirectory() && !nextEntry.getName().endsWith(".DS_Store") && !nextEntry.getName().contains("__MACOSX") && !C0868a.m2109e(nextEntry.getName()).startsWith(".")) {
                    if (nextEntry.getName().endsWith(".png")) {
                        String strM2108d = C0868a.m2108d(nextEntry.getName());
                        RandomAccessFile randomAccessFile2 = (RandomAccessFile) map2.get(strM2108d);
                        randomAccessFile2.seek(((Integer) ((Map) map3.get(strM2108d)).get(C0868a.m2109e(nextEntry.getName()))).intValue());
                        while (true) {
                            int i3 = zipInputStream.read(bArr);
                            if (i3 != -1) {
                                randomAccessFile2.write(bArr, 0, i3);
                            }
                        }
                    } else {
                        File file2 = new File(file, nextEntry.getName());
                        File parentFile = nextEntry.isDirectory() ? file2 : file2.getParentFile();
                        if (!parentFile.isDirectory() && !parentFile.mkdirs()) {
                            throw new FileNotFoundException("Failed to find directory: " + parentFile.getAbsolutePath());
                        }
                        FileOutputStream fileOutputStream3 = new FileOutputStream(file2);
                        while (true) {
                            try {
                                int i4 = zipInputStream.read(bArr);
                                if (i4 == -1) {
                                    break;
                                } else {
                                    fileOutputStream3.write(bArr, 0, i4);
                                }
                            } catch (Throwable th3) {
                                fileOutputStream3.close();
                                throw th3;
                            }
                        }
                        fileOutputStream3.close();
                    }
                }
            }
        } catch (Throwable th4) {
            zipInputStream.close();
            Iterator it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                C0868a.m2114j((Closeable) ((Map.Entry) it2.next()).getValue());
            }
            throw th4;
        }
    }

    /* JADX INFO: renamed from: c */
    public void mo2168c() throws IOException {
        int i;
        int i2;
        String strM2105a = C0868a.m2105a(new FileInputStream(new File(this.f4196a)));
        HashMap map = new HashMap();
        String[] strArrSplit = strM2105a.split(";");
        boolean z = false;
        for (int i3 = 0; i3 < strArrSplit.length; i3++) {
            if (!TextUtils.isEmpty(strArrSplit[i3])) {
                String[] strArrSplit2 = strArrSplit[i3].split(":");
                if (strArrSplit2.length == 3) {
                    try {
                        i = Integer.parseInt(strArrSplit2[1]);
                    } catch (NumberFormatException e) {
                        Log.e("ResourceCodec", "parseInt: ", e);
                        i = -1;
                    }
                    try {
                        i2 = Integer.parseInt(strArrSplit2[2]);
                    } catch (NumberFormatException e2) {
                        Log.e("ResourceCodec", "parseInt: ", e2);
                        i2 = -1;
                    }
                    if (-1 == i || -1 == i2) {
                        StringBuilder sbM1556G = outline.m1556G("Failed to parse offset or length for ");
                        sbM1556G.append(strArrSplit[i3]);
                        throw new IOException(sbM1556G.toString());
                    }
                    map.put(strArrSplit2[0], new Pair(Integer.valueOf(i), Integer.valueOf(i2)));
                } else {
                    continue;
                }
            }
        }
        this.f4198c = map;
        File file = new File(this.f4197b);
        this.f4199d = ByteBuffer.allocateDirect((int) file.length());
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[2048];
        while (true) {
            try {
                try {
                    int i4 = fileInputStream.read(bArr);
                    if (i4 == -1) {
                        break;
                    } else {
                        this.f4199d.put(bArr, 0, i4);
                    }
                } catch (Throwable th) {
                    C0868a.m2114j(fileInputStream);
                    throw th;
                }
            } catch (IOException e3) {
                Log.e("ResourceCodec", "init: ", e3);
                C0868a.m2114j(fileInputStream);
            }
        }
        C0868a.m2114j(fileInputStream);
        z = true;
        if (!z) {
            throw new IOException("Failed to parse data file!");
        }
    }
}
