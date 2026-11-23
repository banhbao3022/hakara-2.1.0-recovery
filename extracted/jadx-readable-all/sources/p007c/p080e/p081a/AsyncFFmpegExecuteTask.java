package p007c.p080e.p081a;

import android.os.AsyncTask;
import com.arthenica.mobileffmpeg.Config;

/* JADX INFO: renamed from: c.e.a.a, reason: use source file name */
/* JADX INFO: compiled from: AsyncFFmpegExecuteTask.java */
/* JADX INFO: loaded from: classes.dex */
public class AsyncFFmpegExecuteTask extends AsyncTask<Void, Integer, Integer> {

    /* JADX INFO: renamed from: a */
    public final String[] f2791a;

    /* JADX INFO: renamed from: b */
    public final ExecuteCallback f2792b;

    /* JADX INFO: renamed from: c */
    public final Long f2793c;

    public AsyncFFmpegExecuteTask(String str, ExecuteCallback executeCallback) {
        this(FFmpeg.m1607b(str), executeCallback);
    }

    @Override // android.os.AsyncTask
    public Integer doInBackground(Void[] voidArr) {
        return Integer.valueOf(Config.m12558a(this.f2793c.longValue(), this.f2791a));
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(Integer num) {
        Integer num2 = num;
        ExecuteCallback executeCallback = this.f2792b;
        if (executeCallback != null) {
            executeCallback.mo1605a(this.f2793c.longValue(), num2.intValue());
        }
    }

    public AsyncFFmpegExecuteTask(String[] strArr, ExecuteCallback executeCallback) {
        this(0L, strArr, executeCallback);
    }

    public AsyncFFmpegExecuteTask(long j2, String str, ExecuteCallback executeCallback) {
        this(j2, FFmpeg.m1607b(str), executeCallback);
    }

    public AsyncFFmpegExecuteTask(long j2, String[] strArr, ExecuteCallback executeCallback) {
        this.f2793c = Long.valueOf(j2);
        this.f2791a = strArr;
        this.f2792b = executeCallback;
    }
}
