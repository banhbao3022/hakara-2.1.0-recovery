package p007c.p190n.p385d.p391l.p392e.p395k;

import android.os.Looper;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p007c.p190n.p194b.p266d.p333n.AbstractC4781i;
import p007c.p190n.p194b.p266d.p333n.InterfaceC4767b;
import p007c.p190n.p194b.p334e.C4799a;

/* JADX INFO: renamed from: c.n.d.l.e.k.b1, reason: use source file name */
/* JADX INFO: compiled from: Utils.java */
/* JADX INFO: loaded from: classes.dex */
public final class Utils3 {

    /* JADX INFO: renamed from: a */
    public static final FilenameFilter f26467a = new a();

    /* JADX INFO: renamed from: b */
    public static final ExecutorService f26468b = C4799a.m10984e("awaitEvenIfOnMainThread task continuation executor");

    /* JADX INFO: renamed from: c.n.d.l.e.k.b1$a */
    /* JADX INFO: compiled from: Utils.java */
    public class a implements FilenameFilter {
        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    public static <T> T m11727a(AbstractC4781i<T> abstractC4781i) throws InterruptedException, TimeoutException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        abstractC4781i.mo10934g(f26468b, new InterfaceC4767b(countDownLatch) { // from class: c.n.d.l.e.k.a1

            /* JADX INFO: renamed from: a */
            public final CountDownLatch f26455a;

            {
                this.f26455a = countDownLatch;
            }

            @Override // p007c.p190n.p194b.p266d.p333n.InterfaceC4767b
            /* JADX INFO: renamed from: a */
            public Object mo5191a(AbstractC4781i abstractC4781i2) {
                CountDownLatch countDownLatch2 = this.f26455a;
                FilenameFilter filenameFilter = Utils3.f26467a;
                countDownLatch2.countDown();
                return null;
            }
        });
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(4L, TimeUnit.SECONDS);
        } else {
            countDownLatch.await();
        }
        if (abstractC4781i.mo10941n()) {
            return abstractC4781i.mo10937j();
        }
        if (abstractC4781i.mo10939l()) {
            throw new CancellationException("Task is already canceled");
        }
        if (abstractC4781i.mo10940m()) {
            throw new IllegalStateException(abstractC4781i.mo10936i());
        }
        throw new TimeoutException();
    }

    /* JADX INFO: renamed from: b */
    public static int m11728b(File file, FilenameFilter filenameFilter, int i, Comparator<File> comparator) {
        File[] fileArrListFiles = file.listFiles(filenameFilter);
        if (fileArrListFiles == null) {
            return 0;
        }
        return m11729c(Arrays.asList(fileArrListFiles), i, comparator);
    }

    /* JADX INFO: renamed from: c */
    public static int m11729c(List<File> list, int i, Comparator<File> comparator) {
        int size = list.size();
        Collections.sort(list, comparator);
        for (File file : list) {
            if (size <= i) {
                return size;
            }
            m11730d(file);
            size--;
        }
        return size;
    }

    /* JADX INFO: renamed from: d */
    public static void m11730d(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                m11730d(file2);
            }
        }
        file.delete();
    }
}
