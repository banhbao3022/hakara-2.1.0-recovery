package p555j.p556a.p557a.p558a.p559a.p573i.p577f0;

import android.widget.ProgressBar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Task;
import mtp.media.karaoke.data.model.Task3;
import mtp.media.karaoke.data.model.Task4;
import mtp.media.karaoke.p628ui.screen.profile.task.TaskActivity;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p636z0.p759s.Observer;

/* JADX INFO: renamed from: j.a.a.a.a.i.f0.a, reason: use source file name */
/* JADX INFO: compiled from: TaskActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class TaskActivity2<T> implements Observer<ArrayList<Task>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TaskActivity f31446a;

    public TaskActivity2(TaskActivity taskActivity) {
        this.f31446a = taskActivity;
    }

    @Override // p636z0.p759s.Observer
    /* JADX INFO: renamed from: d */
    public void mo410d(ArrayList<Task> arrayList) {
        int i;
        Integer num;
        Integer num2;
        Integer num3;
        Integer day;
        ArrayList<Task> arrayList2 = arrayList;
        this.f31446a.f33861z.m13977p(arrayList2);
        ProgressBar progressBar = (ProgressBar) this.f31446a.m14427U(R.id.progress_loading);
        Intrinsics2.m13088d(progressBar, "progress_loading");
        SkuDao.a.m14061M(progressBar);
        TaskActivity taskActivity = this.f31446a;
        Task task = arrayList2.get(0);
        Intrinsics2.m13088d(task, "it[0]");
        Task task2 = task;
        if (taskActivity.f33855E.size() <= 0) {
            Task4 log = task2.getLog();
            int iIntValue = (log == null || (day = log.getDay()) == null) ? 0 : day.intValue();
            if (iIntValue > 0) {
                List<Integer> list = taskActivity.f33851A;
                if (8 <= iIntValue && 14 >= iIntValue) {
                    list = taskActivity.f33852B;
                } else if (15 <= iIntValue && 21 >= iIntValue) {
                    list = taskActivity.f33853C;
                } else if (22 <= iIntValue && 28 >= iIntValue) {
                    list = taskActivity.f33854D;
                }
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    int iIntValue2 = ((Number) it.next()).intValue();
                    if (iIntValue2 < iIntValue) {
                        i = 2;
                    } else {
                        i = iIntValue2 > iIntValue ? 0 : 1;
                    }
                    ArrayList<Task3> arrayList3 = taskActivity.f33855E;
                    ArrayList<Integer> coins = task2.getCoins();
                    if (coins == null || (num = coins.get(iIntValue2 - 1)) == null) {
                        num = 0;
                    }
                    Intrinsics2.m13088d(num, "task.coins?.get(day - 1) ?: 0");
                    int iIntValue3 = num.intValue();
                    ArrayList<Integer> exps = task2.getExps();
                    if (exps == null || (num2 = exps.get(iIntValue2 - 1)) == null) {
                        num2 = 0;
                    }
                    Intrinsics2.m13088d(num2, "task.exps?.get(day - 1) ?: 0");
                    int iIntValue4 = num2.intValue();
                    ArrayList<Integer> diamonds = task2.getDiamonds();
                    if (diamonds == null || (num3 = diamonds.get(iIntValue2 - 1)) == null) {
                        num3 = 0;
                    }
                    Intrinsics2.m13088d(num3, "task.diamonds?.get(day - 1) ?: 0");
                    arrayList3.add(new Task3(iIntValue2, iIntValue3, iIntValue4, num3.intValue(), i));
                }
                TaskAdapter taskAdapter = taskActivity.f33861z;
                ArrayList<Task3> arrayList4 = taskActivity.f33855E;
                SkuDao.a.m14104q(taskActivity);
                Objects.requireNonNull(taskAdapter);
                Intrinsics2.m13089e(arrayList4, "checkIns");
                taskAdapter.f31450f.m13977p(arrayList4);
                Task4 log2 = task2.getLog();
                if (log2 == null || log2.getStatus() != 0) {
                    return;
                }
                taskActivity.mo13969R().m13920o(task2.getId(), taskActivity);
            }
        }
    }
}
