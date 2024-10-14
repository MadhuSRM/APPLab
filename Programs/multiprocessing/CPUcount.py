import multiprocessing
import psutil

num_cores = multiprocessing.cpu_count()
physical_cores = psutil.cpu_count(logical=False)
logical_cores = psutil.cpu_count(logical=True)

print(f"Number of cores in this computer={num_cores}")
print(f"Number of physical cores in this computer={physical_cores}")
print(f"Number of logical cores in this computer={logical_cores}")
