package p007c.p190n.p194b.p209b.p210a2.p211j0;

import java.io.File;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.a2.j0.t, reason: use source file name */
/* JADX INFO: compiled from: SimpleCacheSpan.java */
/* JADX INFO: loaded from: classes.dex */
public final class SimpleCacheSpan extends CacheSpan {

    /* JADX INFO: renamed from: l */
    public static final Pattern f6126l = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* JADX INFO: renamed from: m */
    public static final Pattern f6127m = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* JADX INFO: renamed from: n */
    public static final Pattern f6128n = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    public SimpleCacheSpan(String str, long j2, long j3, long j4, File file) {
        super(str, j2, j3, j4, file);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009f A[PHI: r2
  0x009f: PHI (r2v15 java.util.regex.Matcher) = (r2v10 java.util.regex.Matcher), (r2v8 java.util.regex.Matcher) binds: [B:26:0x0095, B:22:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a2  */
    /* JADX INFO: renamed from: h */
    public static SimpleCacheSpan m2997h(File file, long j2, long j3, CachedContentIndex cachedContentIndex) {
        File file2;
        long j4;
        String strGroup;
        File fileM2998j;
        String name = file.getName();
        if (name.endsWith(".v3.exo")) {
            file2 = file;
        } else {
            String name2 = file.getName();
            Matcher matcher = f6127m.matcher(name2);
            if (matcher.matches()) {
                strGroup = matcher.group(1);
                Objects.requireNonNull(strGroup);
                int i = Util6.f6307a;
                int length = strGroup.length();
                int iEnd = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    if (strGroup.charAt(i3) == '%') {
                        i2++;
                    }
                }
                if (i2 != 0) {
                    int i4 = length - (i2 * 2);
                    StringBuilder sb = new StringBuilder(i4);
                    Matcher matcher2 = Util6.f6315i.matcher(strGroup);
                    while (i2 > 0 && matcher2.find()) {
                        String strGroup2 = matcher2.group(1);
                        Objects.requireNonNull(strGroup2);
                        char c2 = (char) Integer.parseInt(strGroup2, 16);
                        sb.append((CharSequence) strGroup, iEnd, matcher2.start());
                        sb.append(c2);
                        iEnd = matcher2.end();
                        i2--;
                    }
                    if (iEnd < length) {
                        sb.append((CharSequence) strGroup, iEnd, length);
                    }
                    if (sb.length() != i4) {
                        strGroup = null;
                    } else {
                        strGroup = sb.toString();
                    }
                }
            } else {
                matcher = f6126l.matcher(name2);
                if (matcher.matches()) {
                    strGroup = matcher.group(1);
                    Objects.requireNonNull(strGroup);
                } else {
                    strGroup = null;
                }
            }
            if (strGroup == null) {
                fileM2998j = null;
            } else {
                File parentFile = file.getParentFile();
                C2096e.m4572h(parentFile);
                int i5 = cachedContentIndex.m2966d(strGroup).f6080a;
                String strGroup3 = matcher.group(2);
                Objects.requireNonNull(strGroup3);
                long j5 = Long.parseLong(strGroup3);
                String strGroup4 = matcher.group(3);
                Objects.requireNonNull(strGroup4);
                fileM2998j = m2998j(parentFile, i5, j5, Long.parseLong(strGroup4));
                if (!file.renameTo(fileM2998j)) {
                    fileM2998j = null;
                }
            }
            if (fileM2998j == null) {
                return null;
            }
            file2 = fileM2998j;
            name = fileM2998j.getName();
        }
        Matcher matcher3 = f6128n.matcher(name);
        if (!matcher3.matches()) {
            return null;
        }
        String strGroup5 = matcher3.group(1);
        Objects.requireNonNull(strGroup5);
        String str = cachedContentIndex.f6088b.get(Integer.parseInt(strGroup5));
        if (str == null) {
            return null;
        }
        long length2 = j2 == -1 ? file2.length() : j2;
        if (length2 == 0) {
            return null;
        }
        String strGroup6 = matcher3.group(2);
        Objects.requireNonNull(strGroup6);
        long j6 = Long.parseLong(strGroup6);
        if (j3 == -9223372036854775807L) {
            String strGroup7 = matcher3.group(3);
            Objects.requireNonNull(strGroup7);
            j4 = Long.parseLong(strGroup7);
        } else {
            j4 = j3;
        }
        return new SimpleCacheSpan(str, j6, length2, j4, file2);
    }

    /* JADX INFO: renamed from: j */
    public static File m2998j(File file, int i, long j2, long j3) {
        return new File(file, i + "." + j2 + "." + j3 + ".v3.exo");
    }
}
